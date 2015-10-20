package taxiService.service.db;

import org.javalite.activejdbc.Model;
import taxiService.transfer.BaseDto;

import java.util.List;

/**
 * Created by Vitaliy on 17.10.2015.
 */
public interface ITemplateDao <T extends BaseDto>{
//    Model get(String templateName);

    Model get(Long id);

    Model create(T dto);

    void deleteAll();

    void update(T dto);

    void delete(Long id);

    List<? extends Model> getAll();
}
