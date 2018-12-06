package com.task.ui.component.news;

import com.task.data.remote.ServiceError;
import com.task.data.remote.ServiceResponse;
import com.task.data.remote.dto.NewsItem;
import com.task.data.remote.dto.NewsModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahmedEltaher on 3/8/17.
 */

public class TestModelsGenerator {

    public NewsModel generateNewsModel(String stup) {
        NewsModel newsModel = new NewsModel();
        newsModel.setCopyright(stup);
        newsModel.setLastUpdated(stup);
        newsModel.setSection(stup);
        newsModel.setStatus(stup);
        newsModel.setNumResults(25L);
        List<NewsItem> newsItems = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            newsItems.add(generateNewsItemModel(stup));
        }
        newsModel.setNewsItems(newsItems);
        return newsModel;
    }
    public NewsModel generateNewsModelWithEmptyList(String stup) {
        NewsModel newsModel = new NewsModel();
        newsModel.setCopyright(stup);
        newsModel.setLastUpdated(stup);
        newsModel.setSection(stup);
        newsModel.setStatus(stup);
        newsModel.setNumResults(25L);
        List<NewsItem> newsItems = new ArrayList<>();
        newsModel.setNewsItems(newsItems);
        return newsModel;
    }

    public NewsItem generateNewsItemModel(String stup) {
        NewsItem newsItem = new NewsItem();
        newsItem.setTitle(stup);
        newsItem.setAbstract(stup);
        newsItem.setUrl(stup);
        return newsItem;
    }

    public ServiceResponse getNewsSuccessfulModel() {
        String stupString = "this is temp string";
        NewsModel newsModel = generateNewsModel(stupString);
        return new ServiceResponse(ServiceError.SUCCESS_CODE, newsModel);
    }

    public ServiceResponse getNewsErrorModel() {
        return new ServiceResponse(ServiceError.ERROR_CODE, null);
    }
}
