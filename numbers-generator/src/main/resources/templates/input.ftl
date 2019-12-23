<#import "parts/common.ftl" as c> <@c.page>
<#if !matches??>
<div>
<h3>The program calculates matches by generator settings</h3>
</div>
<br/>
<div class="form-group mt-3">	
	<form method="post" enctype="multipart/form-data">
		<div class="input-group">
			<div class="form-group">
			 	<input type="number" class="form-control" id="number1" placeholder="Enter a first number" name = "number1" required>
				<br/>
			 	<input type="number" class="form-control" id="number2" placeholder="Enter a second number" name = "number2" required>
			</div>
		</div>
		<br/>
		<div class="form-group">
			<button type="submit" class="btn btn-info">Calculate</button>
		</div>
	</form>
</div>
</#if>
<#if matches??>
<form>
<ul class="list-group">
  <li class="list-group-item active">Matches:</li>
  <li class="list-group-item">${matches} </li>
</ul>
</form>
</#if>

</@c.page>