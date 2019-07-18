package com.sg.dvdlibrary;

import com.sg.dvdlibrary.controller.DVDLibraryController;
import com.sg.dvdlibrary.dao.DVDLibraryDao;
import com.sg.dvdlibrary.dao.DVDLibraryDaoFileImpl;
import com.sg.dvdlibrary.ui.DVDLibraryView;
import com.sg.dvdlibrary.ui.UserIO;
import com.sg.dvdlibrary.ui.UserIOConsoleImpl;

public class App {

	public static void main(String[] args) {
		UserIO myUserIo = new UserIOConsoleImpl();
		DVDLibraryView myView = new DVDLibraryView(myUserIo);
		DVDLibraryDao myDao = new DVDLibraryDaoFileImpl();
		DVDLibraryController controller = new DVDLibraryController(myDao, myView);
		controller.run();
	}
}
