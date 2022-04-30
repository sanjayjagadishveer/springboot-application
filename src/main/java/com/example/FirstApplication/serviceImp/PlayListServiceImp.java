package com.example.FirstApplication.serviceImp;

import com.example.FirstApplication.Dto.PlayListResponse;
import com.example.FirstApplication.Dto.PlayListReview;
import com.example.FirstApplication.entity.PlayListDetails;
import com.example.FirstApplication.repository.PlayListDAO;
import com.example.FirstApplication.service.PlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayListServiceImp implements PlayListService {

    @Autowired
    private PlayListDAO playListDAO;

    @Override
    public PlayListResponse getPlayListDetails(int listId) {
        PlayListResponse playListResponse=new PlayListResponse();
        Optional<PlayListDetails> playListDetails= playListDAO.findById(listId);
        PlayListDetails details=playListDetails.get();

        playListResponse.setSongName(details.getSongName());
        playListResponse.setSingerName(details.getSingerName());
        playListResponse.setSongDuration(details.getDuration());

        List<PlayListReview> reviewList = new ArrayList<>();

        PlayListReview reviewOne = new PlayListReview();
        reviewOne.setName("sanjay");
        reviewOne.setDescription("90's era songs are evergreen");
        reviewOne.setRating(9.6);
        reviewList.add(reviewOne);

        PlayListReview reviewTwo = new PlayListReview();
        reviewTwo.setName("jagadish");
        reviewTwo.setDescription("hariharan is the best singer");
        reviewTwo.setRating(8.9);
        reviewList.add(reviewTwo);


        PlayListReview reviewThree = new PlayListReview();
        reviewThree.setName("veer");
        reviewThree.setDescription("music is so soothing");
        reviewThree.setRating(8.2);
        reviewList.add(reviewThree);


        playListResponse.setReviews(reviewList);

        return playListResponse;
    }
}
