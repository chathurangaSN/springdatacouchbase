package com.wedevol.springdatacouchbase.core.service.impl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wedevol.springdatacouchbase.core.dao.PlaceCounterRepository;
import com.wedevol.springdatacouchbase.core.dao.PlaceRepository;
import com.wedevol.springdatacouchbase.core.dao.doc.PlaceDoc;
import com.wedevol.springdatacouchbase.core.exception.ApiException;
import com.wedevol.springdatacouchbase.core.exception.ErrorType;
import com.wedevol.springdatacouchbase.core.service.PlaceService;

/**
 * Service that manages the creation of a Place to exemplify the use of multiple templates and
 * repositories.
 *
 * @author Charz++
 */

@Service
public class PlaceServiceImpl implements PlaceService {

  @Autowired
  private PlaceRepository placeRepo;

  @Autowired
  private PlaceCounterRepository placeCounterRepo;

  @Override
  public PlaceDoc findById(Long id) {
    final Optional<PlaceDoc> placeObj = placeRepo.findById(PlaceDoc.getKeyFor(id));
    return placeObj.orElseThrow(() -> new ApiException(ErrorType.PLACE_NOT_FOUND));
  }

  @Override
  public PlaceDoc create(PlaceDoc place) {
    place.setId(placeCounterRepo.counter()); // internally we set the key with that id
    return placeRepo.save(place);
  }

}
