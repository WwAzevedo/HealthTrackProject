<!DOCTYPE html>
<html lang="pt-br">
<head>
	<title>Dieta - Healthtrack</title>
	<nav><%@ include file="header.jsp" %> </nav>
</head>
<body style="background-color: ">
	
	
		<div class="container-fluid">
             

            <div class="row center">
                
                <h1 style="color: black" class="fs-20">Relatorio semanal <strong class="fs-28" style="font-family: Lobster; color: black;">Dieta</strong></h1>
    
            
                <div class="border border-dark rounded border-size-info text-center responsive-text col-md-">
                    <h2 class="p-t-10 p-b-10 ">3</h2>
                    <span>RefeiÃ§Ãµes diferentes feitas essa Semana</span><br>
                    <i class="material-icons md-48">fastfood</i>
                </div>
                
                <div class="border border-dark rounded border-size-info text-center responsive-text">
                    <h2 class="p-t-10 p-b-10">7.500 kcal</h2>
                    <span>Calorias Queimadas</span><br>
                    <i class="material-icons md-48">whatshot</i>
                    
                
                </div>
                
                <div class="border border-dark rounded border-size-info text-center responsive-text">
                    <h2 class="p-t-10 p-b-10">13.300 kcal</h2>
                    <span>Calorias consumidas no periodo</span><br>
                    <i class="material-icons md-48">local_pizza</i>
                
                </div>
                
                <div class="border border-dark rounded border-size-info text-center responsive-text p-b-40">
                    <h2 class="p-t-10 p-b-10">+0,3kg</h2>
                    <span>De massa ganho essa semana</span><br>
                    <i class="material-icons md-48">trending_up</i>
                
                </div>
            
            </div>
            
            <div class="border border-dark"></div>
            
            <div class="col-sm-8 p-b-20  p-t-20"><h2>Adicionar <b>Dieta</b></h2></div>
            <div class="center row">
            
	            <div class="p-r-30  p-t-10 p-b-10">
					<div class="wrap-input-register100-text validate-input" data-validate="Name is required">
						<span class="label-input-register100">Qual alimento você consumiu?</span>
						<input class="input-register100" type="text" step="0.01" min="0" name="altura" placeholder="Ex: banana" required>
						<span class="focus-input-register100"></span>
					</div>
			     </div>
		
	            <div class="p-r-30  p-t-10 p-b-10">
					<div class="wrap-input-register100-text validate-input" data-validate="Name is required">
						<span class="label-input-register100">Quantas gramas?</span>
						<input class="input-register100" type="number" min="0" name="gramas" placeholder="Ex: 200g" required>
						<span class="focus-input-register100"></span>
					</div>
			     </div>       
	            
	             <div class="p-r-30  p-t-10 p-b-10">
					<div class="wrap-input-register100-text validate-input" data-validate="Name is required">
						<span class="label-input-register100">Quantas porções?</span>
						<input class="input-register100" type="number"  min="0" name="porcoes" placeholder="" required>
						<span class="focus-input-register100"></span>
					</div>
			    </div>
			    
			    <div class="col-sm-4">
                      <button type="button" class="btn btn-info"><i class="fa fa-plus"></i> Novo Alimento</button>
                 </div>
            
            </div>
            
            
            
            <div class="row">
                            <div class="tab1">
                                    <div class="table-wrapper">
                        <div class="table-title">
                            <div class="row">
                                
                            </div>
                        </div>
                        
                        
                       
                        
                        <table class="table table-bordered">
                            <thead>
                                <tr>
                                    <th>Alimento</th>
                                    <th>Qnt. Calorias</th>
                                    <th>Data</th>
                                    <th>Ações</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>Café da manhÃ£</td>
                                    <td>700 kcal</td>
                                    <td>20/04/2020</td>
                                    <td>
                                        <a class="add" title="Add" data-toggle="tooltip"><i class="material-icons">+</i></a>
                                        <a class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>
                                        <a class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                                    </td>
                                </tr>
                                <tr>
                                    <td>AlmoÃ§o</td>
                                    <td>1400 kcal</td>
                                    <td>20/04/2020</td>
                                    <td>
                                        <a class="add" title="Add" data-toggle="tooltip"><i class="material-icons">+</i></a>
                                        <a class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>
                                        <a class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Jantar</td>
                                    <td>1200 kcal</td>
                                    <td>20/04/2020</td>
                                    <td>
                                        <a class="add" title="Add" data-toggle="tooltip"><i class="material-icons">+</i></a>
                                        <a class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>
                                        <a class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                                    </td>
                                </tr>      
                            </tbody>
                        </table>
                    </div>
                
                </div>
            </div> 

		</div>
 
</body>
</html>