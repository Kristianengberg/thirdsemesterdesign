package groupone.demo.service.springdatajpa;

import groupone.demo.model.Car;
import groupone.demo.model.Offer;
import groupone.demo.repository.CarRepository;
import groupone.demo.repository.OfferRepository;
import groupone.demo.service.OfferService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class OfferJPA implements OfferService {

    private final OfferRepository offerRepository;

    public OfferJPA(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }


    @Override
    public Set<Offer> findAll() {
        Set<Offer> set = new HashSet<>();
        offerRepository.findAll().forEach(set::add);
        return set;
    }

    @Override
    public Offer save(Offer object) {
        return offerRepository.save(object);
    }

    @Override
    public void delete(Offer object) {
        offerRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        offerRepository.deleteById(aLong);

    }

    @Override
    public Optional<Offer> findById(Long aLong) {
        return offerRepository.findById(aLong);
    }
}
