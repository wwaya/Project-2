import java.util.ArrayList;
/**
 * Project 2
 * CS 2334, Section 012
 * Sep 25, 2013
 * <P>
 * 
 * Article.java
 * Class that extended from Paper class that would 
 * allow to create objects for the Article class itself
 * 
 * </P>
 * @version 1.0
 */

public class Article extends Paper{
 
  /**
     * Constructor that would allow to create an Article object 
     * that extended from Paper
     * 
     * <P>
     * Algorithm:<br>
     * 1. Once the class is inherited from the superclass,
     *    using super() method would allow to set the variables 
     *    for subclass as well.
     * <br>
     * </P>
     *@param  paperTitle  Title of the paper(esspcially an article)
     *@param  beginNumber  number of pages that begins 
     *@param  endNumber  number of pages that ends
     * 
     * <dt><b>Conditions:</b>
     * <dd>PRE  -   Paper class must be implemented, and each parameters would need to be in appopriate type.
     * <dd>POST -   Once the object is set, the object must be able to use all the methods that implemented from the parent class.
     */
 public Article(String paperTitle, int beginNumber, int endNumber){
  super(paperTitle, beginNumber, endNumber);
 }
}