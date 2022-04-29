package com.example.FirstApplication.serviceImp;

import com.example.FirstApplication.Dto.BootCampDetailsResponse;
import com.example.FirstApplication.Dto.ReviewResponse;
import com.example.FirstApplication.entity.BootCampDetails;
import com.example.FirstApplication.repository.BootCampDAO;
import com.example.FirstApplication.service.BootCampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class BootCampServiceImp  implements BootCampService {

    @Autowired
    private BootCampDAO bootCampDAO;

    @Override
    public BootCampDetailsResponse getBootCampDetails(int batchId) {

        BootCampDetailsResponse bootCampDetailsResponse = new BootCampDetailsResponse();
        Optional<BootCampDetails> bootCampDetails=bootCampDAO.findById(batchId);

        BootCampDetails details =bootCampDetails.get();

       bootCampDetailsResponse.setTechnology(details.getTechnology());
       bootCampDetailsResponse.setTrainer(details.getTrainerName());
       bootCampDetailsResponse.setDuration(details.getDuration());

        List<ReviewResponse> reviewResponseList=new ArrayList<>();
        ReviewResponse reviewResponse=new ReviewResponse();
        reviewResponse.setName("shankar");
        reviewResponse.setDescription("good trainer");
        reviewResponse.setRating("5");
        reviewResponseList.add(reviewResponse);

        ReviewResponse reviewResponse1=new ReviewResponse();
        reviewResponse1.setName("shantanu");
        reviewResponse1.setDescription("good trainer");
        reviewResponse1.setRating("4.9");
        reviewResponseList.add(reviewResponse1);

        bootCampDetailsResponse.setReviewResponse(reviewResponseList);

        return  bootCampDetailsResponse;

    }

}
