package com.sg.dvdlibrary.ui;

import java.util.Date;
import java.util.List;

import com.sg.dvdlibrary.dto.DVDLibrary;

public class DVDLibraryView {

	private UserIO io;

	public DVDLibraryView(UserIO io) {
		this.io = io;
	}

	public int printMenuAndGetSelection() {

		io.print("=========================");
		io.print("Initial Menu:");
		io.print("   (Please select option)");
		io.print(" ");
		io.print("   1. Add DVD to Collection");
		io.print("   2. Remove DVD from Collection");
		io.print("   3. Update DVD on Collection");
		io.print("   4. List All DVDs");
		io.print("   5. Find DVDs by title");
		io.print("   6. Find a DVD by title");
		io.print("   7. Exit");

		return io.readInt("Please select from the above choices.", 1, 6);
	}

	public DVDLibrary getNewDVDInfo() {

		DVDLibrary thisDvd = new DVDLibrary(
				io.readString("Please enter Title:"));
		thisDvd.setDirectorName(io.readString("Please enter Director's Name:"));
		thisDvd.setMpaaRating(io.readString("Please enter MpaaRating:"));
		thisDvd.setReleaseDate(new Date(io.readString("Please enter Release Date (ddMMyyyy):")));
		thisDvd.setStudio(io.readString("Please enter Studio:"));
		thisDvd.setUserRatingNotes(io.readString("Please enter any comments or review:"));
		return thisDvd;
	}

	public void displayAddresses(List<DVDLibrary> dvdCollection) {
		for (DVDLibrary thisDvd : dvdCollection) {
			io.print(thisDvd.getTittle() + " - " + thisDvd.getReleaseDate() + " - " +
					thisDvd.getMpaaRating() + " stars.");
			io.print(thisDvd.getDirectorName());
			io.print(thisDvd.getStudio());
			io.print(thisDvd.getUserRatingNotes());
			io.print(" ");
		}
		io.readString("Please hit enter to continue.");
	}

	public void displayMessage(String msg) {
		io.print(msg);
	}

	public String displayMessageValue(String msg, boolean op) {
		if (op)
			return io.readString(msg + "Please Hit enter to continue");
		else
			return io.readString(msg);
	}
}
