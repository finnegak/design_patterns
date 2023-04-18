package adapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * A class that transforms and adapts data
 * @author Kelly Finnegan
 */
public class MediaAdapter implements Media {
    private LittleMedia littleMedia;

    /**
     * constructor to set the data that needs to be changed
     * @param littleMedia
     */
    public MediaAdapter(LittleMedia littleMedia){
        this.littleMedia = littleMedia;
    }

    /**
     * method that returns the orginal datas title
     * @return string title
     */
    public String getTitle(){
        return littleMedia.getTitle();
    }

    /**
     * method that returns the orginal datas author by extracting the author represented by a string
     * @return Author author
     */
    public Author getAuthor(){
        String author = littleMedia.getAuthor();
        String[] authorInfo = author.split(" ");
        return new Author(authorInfo[0], authorInfo[1]);
    }

    /**
     * method that returns the orginal datas description
     * @return String desc
     */
    public String getDescription(){
        return littleMedia.getDescription();
    }
    
    /**
     * method that returns the reviews as an arraylist of type Review by extracting the reviews from ArrayList<String> Reviews
     * @return arraylist of reviews
     */
    public ArrayList<Review> getReviews(){
        String splitBy = "\\.";
        String ending = ".";
        ArrayList <String> reviewsStr = littleMedia.getReviews();
        ArrayList<Review> reviews = new ArrayList<Review>();
        for (String review: reviewsStr){
            String[] info = review.split("-");
            String[] rating = info[0].split(" ");
            if (info[1].contains("!")){
                splitBy = "!";
                ending = "!";
            }
            String[] commentAuthor = info[1].split(splitBy);
            String[] firstLast = commentAuthor[1].split(" ");
            Review newReview = new Review(firstLast[2], firstLast[3], parseDate(info[2]), Double.parseDouble(rating[0]), commentAuthor[0]+ending);
            reviews.add(newReview);
        }
        return reviews;
    }
    
    /**
     * method that adds a review to the orginal data
     * @param firstName first name of the reviewer
     * @param lastName  last name of the reviewer
     * @param date date of the review
     * @param rating number of stars
     * @param comment review
     */
    public void addReview(String firstName, String lastName, Date date, double rating, String comment) {
        String fullName = firstName+" "+lastName;
        int ratingInt = (int) rating;
        littleMedia.addReview(fullName, date, ratingInt, comment);
    }

    /**
     * helper method written by Portia Plante
     * Converts a string date in the format MM/dd/yyyy to a java date
     * 
     * @param date The string formatted date
     * @return The new date or null if the string is in the incorrect format
     */
    private static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("MM/dd/yyyy").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }
}
