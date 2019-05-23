        JSONObject output;
		    try {
		        output = new JSONObject(jsonString);
		        JSONArray docs = output.getJSONArray("dockList");
				    IDataUtil.put( pipelineCursor, "csvString", CDL.toString(docs) );
		
		    } 
		    } catch (Exception e) {
		        e.printStackTrace();
		    }  
