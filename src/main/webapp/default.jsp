<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> GesTech</title>
<script
			src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.5/jspdf.debug.js"></script>
		<link rel="icon" href="assets/img/basic/favicon.ico" type="image/x-icon">
		<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
			rel="stylesheet">
		<title>GesTech</title>
		<link rel="stylesheet"
			href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
			integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
			crossorigin="anonymous">
		<script
			src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
			integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
			crossorigin="anonymous"></script>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
			integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
			crossorigin="anonymous"></script>
		<link rel="stylesheet" href="style.css">
		<script type="text/javascript" src="javascript.js"></script>
		<link rel="preconnect" href="https://fonts.googleapis.com">
		<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
		<link
			href="https://fonts.googleapis.com/css2?family=Roboto:ital@1&display=swap"
			rel="stylesheet">
		<link rel="stylesheet"
			href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
			integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
			crossorigin="anonymous">
		<script
			src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
			integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
			crossorigin="anonymous"></script>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
			integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
			crossorigin="anonymous"></script>
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.5/jspdf.debug.js"></script>
		<link rel="stylesheet" href="app.css">
		<script type="text/javascript" src="javascript.js"></script>
</head>
<body>
<!--  NAVBAR HOME-->
<div class="navbar navbar-expand d-flex navbar-dark justify-content-between bd-navbar blue accent-3 shadow">
	<div class="relative">
		<div class="d-flex">
			<div class="d-none d-md-block">
				<h1 class="nav-title text-white">Home</h1>
			</div>
		</div>
	</div>
	<!--Top Menu Start -->
</div>
<!--  FINE NAVBAR HOME-->

<!--  NAVBAR PROFILO E CV -->
<div class="navbar navbar-expand d-flex navbar-dark justify-content-between bd-navbar blue accent-3 shadow">
	<div class="relative">
		<div class="d-flex">
			<div class="d-none d-md-block">
				<h1 class="nav-title text-white">Aggiungi risorsa</h1>
			</div>
		</div>
	</div>
	<!--Top Menu Start -->
</div>
<!-- FINE NAVBAR PROFILO E CV -->

<!-- NAVBAR RICERCA -->
<div class="navbar navbar-expand d-flex navbar-dark justify-content-between bd-navbar blue accent-3 shadow">
	<div class="relative">
		<div class="d-flex">
			<div class="d-none d-md-block">
				<h1 class="nav-title text-white">Tutte le risorse</h1>
			</div>
		</div>
	</div>
	<!--Top Menu Start -->
</div>
<!-- FINE NAVBAR RICERCA -->

<!--  NAVBAR STAMPAPROFILO -->
<div class="navbar navbar-expand d-flex navbar-dark justify-content-between bd-navbar blue accent-3 shadow">
	<div class="relative">
		<div class="d-flex">
			<div class="d-none d-md-block">
				<h1 class="nav-title text-white">Modifica</h1>
			</div>
		</div>
	</div>
	<!--Top Menu Start -->
</div>
<!-- FINE NAVBAR STAMPAPROFILO -->

<!--  NAVBAR SOLA LETTURA -->
<div class="navbar navbar-expand d-flex navbar-dark justify-content-between bd-navbar blue accent-3 shadow">
	<div class="relative">
		<div class="d-flex">
			<div class="d-none d-md-block">
				<h1 class="nav-title text-white">Dettaglio</h1>
			</div>
		</div>
	</div>
	<!--Top Menu Start -->
</div>
<!--  FINE NAVBAR SOLA LETTURA -->

<!--  NAVBAR CAMBIA PASWORDA -->
<div class="navbar navbar-expand d-flex navbar-dark justify-content-between bd-navbar blue accent-3 shadow">
	<div class="relative">
		<div class="d-flex">
			<div class="d-none d-md-block">
				<h1 class="nav-title text-white">Cambia Password</h1>
			</div>
		</div>
	</div>
	<!--Top Menu Start -->
</div>
<!-- FINE NAVBAR CAMBIA PASSWORD -->

<!--  NAVBAR AGGIUNGI NUOVO UTENTE -->
<div class="navbar navbar-expand d-flex navbar-dark justify-content-between bd-navbar blue accent-3 shadow">
	<div class="relative">
		<div class="d-flex">
			<div class="d-none d-md-block">
				<h1 class="nav-title text-white">Aggiungi nuovo utente</h1>
			</div>
		</div>
	</div>
	<!--Top Menu Start -->
</div>
<!-- FINE  NAVBAR AGGIUNGI NUOVO UTENTE -->

<!--SIDEBAR-->
<div id="app">
		<aside class="main-sidebar fixed offcanvas shadow"
			data-toggle='offcanvas'>
			<section class="sidebar">
				<div class="mt-3 mb-3 ml-3">
					<img src="Immagini/logo.png" alt="">
				</div>
				<div class="relative">
					<div class="user-panel p-3 light mb-2">
						<div>
							<div class="float-left image">
								<img class="user_avatar" src="Immagini/u2.png" alt="User Image">
							</div>
							<div class="float-left info">
								<h6 class="font-weight-light mt-2 mb-1"><%String utente = (String)session.getAttribute("Utente"); out.println(utente);%></h6>
								<a href="#"><%String ruolo = (String)session.getAttribute("Ruolo"); out.println(ruolo);%></a>
							</div>
						</div>
						<div class="clearfix"></div>
						<div id="userSettingsCollapse">
							<div class="list-group mt-3 shadow">
								<a href="cambiapassword.jsp" class="list-group-item list-group-item-action"><i
									class="icon icon-lock black-text s-18"></i> <span class="cambiapass">Cambia Password</span></a>
							</div>
						</div>
					</div>
				</div>
				<ul class="sidebar-menu">
				<li class="treeview"><a href="home.jsp"> <i
							class="icon icon-home light-blue-text s-18"> <input
								type="hidden" name="Servlet" value="logout">
						</i> <span>Home/Avvisi</span>
					</a></li>
						<li class="treeview"><a href="ricerca.jsp"> <i
							class="icon icon-account_box red-text s-18"> <input
								type="hidden" name="Servlet" value="logout">
						</i> <span>Tutte le risorse</span>
					</a></li>
						<li class="treeview"><a href="profilo&cv.jsp"> <i
							class="icon icon-add_box light-green-text s-18"> <input
								type="hidden" name="Servlet" value="logout">
						</i> <span>Aggiungi risorsa</span>
					</a></li>
					<li class="treeview"><a href="nuovoutente.jsp"> <i
							class="icon icon-add_box light-green-text s-18"> <input
								type="hidden" name="Servlet" value="logout">
						</i> <span>Aggiungi nuovo utente</span>
					</a></li>
					<li class="treeview"><a href="index.jsp"> <i
							class="icon icon-exit_to_app purple-text s-18"> <input
								type="hidden" name="Servlet" value="logout">
						</i> <span>Esci</span>
					</a></li>
				</ul>
			</section>
		</aside>
		</div>
		<!--FINE SIDEBAR-->
</body>
</html>