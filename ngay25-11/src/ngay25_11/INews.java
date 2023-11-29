package ngay25_11;

import java.util.Scanner;

public interface INews {
    void Display();

}
class News implements INews{
    public int id;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public float AverageRate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    @Override
    public void Display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Publish Date: " + getPublishDate());
        System.out.println("Author: " + getAuthor());
        System.out.println("Content: " + getContent());
        System.out.println("Average Rate: " + getAverageRate());
    }
    public int[]RateList = new int[3];
    public void calculate() {
        int sum = 0;
        for (int rate : RateList) {
            sum += rate;
        }
        if (RateList.length > 0) {
            AverageRate = (float) sum / RateList.length;
        }
    }
    public void inputRate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 3 đánh giá sao từ (1-5):");
        for (int i = 0; i < RateList.length; i++) {
            System.out.print("Đánh giá " + (i + 1) + ": ");
            int rate = scanner.nextInt();
            if (rate >= 1 && rate <= 5) {
                RateList[i] = rate;
            } else {
                System.out.println("Đánh giá không hợp lệ. Vui lòng nhập một đánh giá trong khoảng từ 1 đến 5.");
                i--; // Nếu nhập không hợp lệ, lặp lại việc nhập cho cùng một vị trí
            }
        }
        calculate(); // Tính lại trung bình sau khi nhập đánh giá
    }

}
