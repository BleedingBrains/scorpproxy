/**
 * 
 */
package in.scorpion.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Amey Jadiye
 */
public class HtmlParser
{
    /** local processor */
    private static final  String LOCAL_PROCESSOR = "proxy?url=";

    /**
     * The method for appending local link to Html links
     * @param mytext mytext
     * @return mytext processed mytext
     */
    public static String getLinkifiedMyText(String mytext)
    {

        try {
            Pattern patt = Pattern.compile("(?i)\\b((?:https?://|www\\d{0,3}[.]|[a-z0-9.\\-]+[.][a-z]{2,4}/)(?:[^\\s()<>]+|\\(([^\\s()<>]+|(\\([^\\s()<>]+\\)))*\\))+(?:\\(([^\\s()<>]+|(\\([^\\s()<>]+\\)))*\\)|[^\\s`!()\\[\\]{};:\'\".,<>???“”‘’]))");
            Matcher matcher = patt.matcher(mytext);

            return matcher.replaceAll(LOCAL_PROCESSOR + "$1");

        }
        catch (Exception e) {
            return mytext;
        }
    }
}
