package net.mindsoup.irori.services;

/**
 * Created by Valentijn on 15-7-2017.
 */
public interface TextService {

	String getSynonym(String name, String objectType);
	String getClosestMatch(String name);
}
