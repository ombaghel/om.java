try {
	        Socket sock = new Socket(host,  port );
	        sock.close();
	        return true;
	    }
	    catch (Exception e) {
	        return false;
	    }
