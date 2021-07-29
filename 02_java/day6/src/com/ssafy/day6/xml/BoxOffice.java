package com.ssafy.day6.xml;

import java.util.Date;

/**
 * @since 2021. 7. 9.
 */


public class BoxOffice {
    private Integer rank; // 등수
    private String movieNm; // 영화제목
    private Date openDt; // 개봉일
    private Integer audiAcc;// 누적 관객 수

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getMovieNm() {
        return movieNm;
    }

    public void setMovieNm(String movieNm) {
        this.movieNm = movieNm;
    }

    public Date getOpenDt() {
        return openDt;
    }

    public void setOpenDt(Date openDt) {
        this.openDt = openDt;
    }

    public Integer getAudiAcc() {
        return audiAcc;
    }

    public void setAudiAcc(Integer audiAcc) {
        this.audiAcc = audiAcc;
    }

    public Date toDate(String date) {
        Date dateObj = null;
        // TODO: 문자열 형태의 날짜를 Date로 변환해서 반환하시오.
        // END:
        return dateObj;
    }

    @Override
    public String toString() {
        return "[rank=" + rank + ", movieNm=" + movieNm + ", openDt=" + openDt + ", audiAcc="
               + audiAcc + "]";
    }
}