<#include "head"> 
<#include "header"> 
<#include "footer"> 
<!DOCTYPE html>
<html>
<head>
<@page_head/> 
</head>
<body class="game_info" data-spy="scroll" data-target=".header">
	<!-- LOADER -->
	<div id="preloader">
		<img class="preloader" src="images/loading-img.gif" alt="">
	</div>
	
	<section id="top">
	 <header>
		<@page_header/> 
	 </header>
	 <div class="full-slider">
	 	<@page_carousel>
	 </div>
	</section>
	
	 <div class="matchs-info">
	 	<@page_match_info>
	 </div>
	
	<section id="contant" class="contant>
	
	</section>
	
	<footer id="footer" class="footer">
		<@page_footer>
	</footer>
</body>
</html>