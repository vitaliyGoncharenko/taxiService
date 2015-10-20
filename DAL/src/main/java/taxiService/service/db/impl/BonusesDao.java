package taxiService.service.db.impl;

import taxiService.model.Bonuses;
import taxiService.model.Customer;
import taxiService.service.db.ITemplateDao;
import taxiService.transfer.BonusesDto;

import java.util.List;

/**
 * Created by Vitaliy on 17.10.2015.
 */
public class BonusesDao implements ITemplateDao<BonusesDto> {

    public Bonuses get(Long id) {
        return Bonuses.findFirst("id", id);
    }

    @Override
    public Bonuses create(BonusesDto bonusesDto) {
        Bonuses bonuses = new Bonuses();
        bonuses.setCountBonuses(bonusesDto.getCountBonuses());
        bonuses.setDiscount(bonusesDto.getDiscount());

        if (bonusesDto.getCustomerId() != null) {
            bonuses.setParent(Customer.findById(bonusesDto.getCustomerId()));
        }

        bonuses.saveIt();
        return bonuses;
    }

    public void deleteAll() {
        List<Bonuses> bonusesList = Bonuses.findAll();
        for (Bonuses bonuses : bonusesList) {
            bonuses.deleteCascadeShallow();
        }
    }

    @Override
    public void update(BonusesDto bonusesDto) {
        Bonuses bonuses = Bonuses.findById(bonusesDto.getId());
        if (bonuses != null) {
            bonuses.setDiscount(bonusesDto.getDiscount());
            bonuses.setCountBonuses(bonusesDto.getCountBonuses());
            bonuses.setCustomerId(bonusesDto.getCustomerId());
            bonuses.saveIt();
        }
    }


    public void delete(Long id) {
        Bonuses bonuses = Bonuses.findById(id);
        if (bonuses != null) {
            bonuses.deleteCascadeShallow();
        }
    }

    public List<Bonuses> getAll() {
        return Bonuses.findAll();
    }
}
