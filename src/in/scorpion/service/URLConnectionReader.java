package in.scorpion.service;

import in.scorpion.Util.HtmlParser;

import java.net.*;
import java.io.*;

/**
 * The class for doing the processing on remot URL connections
 * @author Amey Jadiye
 */
public class URLConnectionReader
{
    /** some server needs proxy */
    private static boolean isProxyRequred;

    /**
     * The class for getting processed buffer of HTML
     * @param url the url to process
     * @return processed HTML
     * @throws IOException Exception
     */
    public static synchronized String getBuffer(String url) throws IOException
    {
        StringBuffer buffer = new StringBuffer();

        URL oracle = new URL(url);
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            buffer.append(inputLine);
        }
        in.close();
        return HtmlParser.getLinkifiedMyText(buffer.toString());
    }

    /**
     * @return the isProxyRequred
     */
    public static boolean isProxyRequred()
    {
        return isProxyRequred;
    }

    /**
     * The method for settign the dproxy to system.
     * @param isProxyRequred isProxyRequred
     * @param proxyHost proxyHost
     * @param proxyPort proxyPort
     */
    public static void setProxyRequred(boolean isProxyRequred, String proxyHost, String proxyPort)
    {
        if (isProxyRequred) {
            System.getProperties().put("proxyHost", proxyHost);
            System.getProperties().put("proxyPort", proxyPort);
        }
        URLConnectionReader.isProxyRequred = isProxyRequred;
    }

}