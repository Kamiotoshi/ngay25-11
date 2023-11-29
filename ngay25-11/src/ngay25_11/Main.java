package ngay25_11;

import ngay25_11.News;

public class Main {
    public static void main(String[] args) {
        News news = new News();
        news.setTitle("Đánh giá");
        news.setPublishDate("2023-11-23");
        news.setAuthor("Minh");
        news.setContent("Chất lương bài đọc");

        // Nhập đánh giá và tính trung bình
        news.inputRate();

        // Hiển thị thông tin tin tức
        news.Display();
    }
}
