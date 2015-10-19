package taxiService.service.db.impl;

import org.javalite.activejdbc.Model;
import taxiService.model.Bonuses;
import taxiService.model.Customer;
import taxiService.service.db.ITemplateDao;
import taxiService.transfer.BaseDto;
import taxiService.transfer.BonusesDto;

import java.util.List;

/**
 * Created by Vitaliy on 17.10.2015.
 */
public class BonusesDao implements ITemplateDao<BonusesDto> {
    public Model get(String templateName) {
        return Bonuses.findFirst("countBonuses", templateName);
    }

    public Model get(Long id) {
        return Bonuses.findFirst("id", id);
    }

    @Override
    public Model create(BonusesDto bonusesDto) {
        Bonuses bonuses = new Bonuses();
        bonuses.setCountBonuses(bonusesDto.getCountBonuses());
        bonuses.setDiscount(bonusesDto.getDiscount());

        if (bonuses.getCustomerId() != null) {
            bonuses.setParent(Customer.findById(bonusesDto.getCustomerId()));
        }
        bonuses.saveIt();
        return bonuses;
    }

    public void delete(String templateName) {

    }

    @Override
    public void update(BonusesDto dto) {

    }


    public void delete(Long id) {

    }

    public List<? extends Model> getAll() {
        return null;
    }
}
