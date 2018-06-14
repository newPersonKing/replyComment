package com.kcrason.highperformancefriendscircle.beans.emoji;

import java.util.List;

/**
  存储的是每一页的表情 每页20个
 */
public class EmojiPanelBean {
    public int getEmojiType() {
        return emojiType;
    }

    public void setEmojiType(int emojiType) {
        this.emojiType = emojiType;
    }

    public int getMaxPage() {
        return maxPage;
    }

    public void setMaxPage(int maxPage) {
        this.maxPage = maxPage;
    }

    public List<EmojiBean> getEmojiBeansPerPage() {
        return emojiBeansPerPage;
    }

    public void setEmojiBeansPerPage(List<EmojiBean> emojiBeansPerPage) {
        this.emojiBeansPerPage = emojiBeansPerPage;
    }

    /**
     * emoji类型
     */
    private int emojiType;

    /**
     * 同一种类型的emoji需要占用的最大页数
     */
    private int maxPage;

    /**
     * 每一页emoji的数量
     */
    private List<EmojiBean> emojiBeansPerPage;
}
