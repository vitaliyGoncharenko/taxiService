use robotexecution;
SELECT 
    *
FROM
    (SELECT 
        *, @row_number:=@row_number + 1 AS row_number
    FROM
        (SELECT 
        collectionqueue.*,
            collectionrequest.user_login AS userId,
            collectionrequest.name AS taskName,
            collectionrequest.priority AS originalPriority,
            collector.caption AS source
    FROM
        collectionqueue 
        
    LEFT JOIN (SELECT DISTINCT
        collectionrequest.id,
            collectionrequest.user_login,
            collectionrequest.name,
            collectionrequest.priority
    FROM
        collectionrequest) AS collectionrequest 
        ON collectionrequest.id = collectionqueue.collectionrequest_id
        
    LEFT JOIN (SELECT DISTINCT
        requestsubmission.collectionrequest_id,
            requestsubmission.collector_id
    FROM
        requestsubmission) AS requestsubmission 
        ON collectionrequest.id = requestsubmission.collectionrequest_id
        
    LEFT JOIN (SELECT DISTINCT
        collector.id, 
        collector.caption
    FROM
        collector) AS collector 
        ON collector.id = requestsubmission.collector_id
    
    WHERE 1 = 1 AND
        collectionqueue.status <> 'CANCELED'
    ORDER BY creationtime DESC) AS allresult, (SELECT @row_number:=0) AS t_rn) AS totalresult
    
WHERE
    totalresult.row_number >= 1
LIMIT 10
