package com.mahadi.service;

import com.mahadi.dao.Notice;
import com.mahadi.dao.NoticesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Mahadi on 10/17/2017.
 */

@Service("noticesService")
public class NoticeService {

    private NoticesDAO noticesDAO;

    @Autowired
    public void setNoticesDAO(NoticesDAO noticesDAO) {
        this.noticesDAO = noticesDAO;
    }

    public List<Notice> getCurrent(){
        return noticesDAO.getNotices();
    }

    public void create(Notice notice) {
        noticesDAO.create(notice);
    }

    public void throwTestException() {
        noticesDAO.getNotices();
    }
}
