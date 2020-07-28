package com.practice;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Voters {

	public static void main(String[] args) {
		List<Object[]> voterDetails = new ArrayList<Object[]>();
		List<String> allParties = new ArrayList<String>();
		voterDetails.add(new Object[] { "JSP", false, true });
		voterDetails.add(new Object[] { "JSP", false, true });
		voterDetails.add(new Object[] { "JSP", false, true });
		voterDetails.add(new Object[] { "JSP", false, true });
		voterDetails.add(new Object[] { "JSP", false, true });
		voterDetails.add(new Object[] { "JSP", false, true });
		voterDetails.add(new Object[] { "JSP", false, true });
		voterDetails.add(new Object[] { "JSP", false, true });
		voterDetails.add(new Object[] { "JSP", false, true });
		voterDetails.add(new Object[] { "JSP", false, true });
		voterDetails.add(new Object[] { "JSP", false, true });
		voterDetails.add(new Object[] { "JSP", false, true });
		voterDetails.add(new Object[] { "JSP", false, true });
		voterDetails.add(new Object[] { "JSP", false, true });
		voterDetails.add(new Object[] { "JSP", false, true });
		voterDetails.add(new Object[] { "JSP", false, true });
		voterDetails.add(new Object[] { "JSP", false, true });

		allParties.add("JSP");

		HashMap<String, Object[]> partyResults = elections(voterDetails, allParties);

		for (String eachParty : partyResults.keySet()) {
			Object[] eachPartyResults = partyResults.get(eachParty);
			System.out.println(Arrays.asList(eachPartyResults));
			Integer i = new Integer((int) eachPartyResults[1]);
			double notaPercentage = new Integer((int) eachPartyResults[1]) * 100.0 / eachPartyResults.length;
			if (notaPercentage > 40.0) {
				// call the elections again
			}
		}

	}

	public static HashMap<String, Object[]> elections(List<Object[]> voterDetails, List<String> allParties) {

		HashMap<String, Object[]> partyResults = new HashMap<String, Object[]>();
		for (Object[] eachVoter : voterDetails) {
			for (String partyName : allParties) {
				if (partyName.equalsIgnoreCase(eachVoter[0].toString())) {
					if ((Boolean) eachVoter[2] == true) {
						if (partyResults.containsKey(partyName)) {
							Object[] o = partyResults.get(partyName);
							o[1] = (int) o[1] + 1;
							partyResults.put(partyName, o);
						} else {
							partyResults.put(partyName, new Object[] { 0, 1 });
						}
					} else if ((Boolean) eachVoter[1] == true && (Boolean) eachVoter[2] == false) {
						if (partyResults.containsKey(partyName)) {
							Object[] o = partyResults.get(partyName);
							o[0] = (int) o[0] + 1;
							partyResults.put(partyName, o);
						} else
							partyResults.put(partyName, new Object[] { 1, 0 });
					} else {
						if (partyResults.containsKey(partyName)) {
							partyResults.put(partyName, partyResults.get(partyName));
						} else
							partyResults.put(partyName, new Object[] { 0, 0 });
					}
					break;
				}
			}
		}
		return partyResults;

	}

}
