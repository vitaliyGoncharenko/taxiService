package taxiService.service.db.impl;

import org.javalite.activejdbc.Model;
import taxiService.model.Bonuses;
import taxiService.service.db.ITemplateDao;
import taxiService.transfer.BaseDto;
import taxiService.transfer.BonusesDto;

import java.util.List;

/**
 * Created by Vitaliy on 17.10.2015.
 */
public class BonusesDao implements ITemplateDao {
    public Model get(String templateName) {
        return Bonuses.findFirst("countBonuses", templateName);
    }

    public Model get(Long id) {
        return Bonuses.findFirst("id", id);;
    }

    public Model create(BonusesDto bonusesDto) {
        Bonuses bonuses = new Bonuses();
        bonuses.setCountBonuses(bonusesDto.getCountBonuses());
        bonuses.setDiscount(bonusesDto.getDiscount());

        if (bonusesDto.getTemplateId() != null)
            field.setParent(Template.findById(fieldDto.getTemplateId()));

        if (fieldDto.getTypeFieldName() != null)
            field.setParent(TypeField.findFirst("name = ?", fieldDto.getTypeFieldName()));

        field.saveIt();
        return field;
    }

    public void delete(String templateName) {

    }

    public void update(BaseDto dto) {

    }

    public void delete(Long id) {

    }

    public List<? extends Model> getAll() {
        return null;
    }
}
