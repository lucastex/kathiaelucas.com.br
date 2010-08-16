new File(".").eachFile { fl ->
	
	if (!fl.name.endsWith("groovy")) {
		println "<img src='fts/${fl.name}'></img>"
		println "<p>Kathia e Lucas</p>"
		println ""
	}
	
}