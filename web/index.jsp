<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="entity.Agent"%>
<%@page import="dataAccessLayer.AgentMapper"%>
<jsp:include page="header.jsp" />

<% AgentMapper agentMapper = new AgentMapper();%>

<div class="container">
    <form method="POST" action="addagent">
        <div class="row">
            <div class="form-group">
                <p>Agent name: </p><input class="form-control" type="text" name="agentName" required>
            </div>
            <div class="form-group">
                <p>Agent lvl: </p><input class="form-control" type="text" name="agentLvl" required>
            </div>
            <div class="form-group">
                <p>Agent DZ-lvl: </p><input class="form-control" type="text" name="agentDzLvl" required>
            </div>
            <button type="submit" class="btn btn-primary">Add agent</button>
            <br><br><br>
        </div>
    </form>
    <div class="row">
        <% List<Agent> agents = agentMapper.getAllAgentsByUserId(1);
            for (Agent agent : agents) {%>
        <div class="row well">
            <div class="col-md-4">
                <p class="agentName">Name: <%= agent.getName()%></p>
            </div>
            <div class="col-md-2 col-md-offset-2">
                <p class="agentName">Lvl: <%= agent.getLvl()%> </p>
            </div>
            <div class="col-md-2">
                <p class="agentName">DZ Lvl: <%= agent.getdZLvl()%></p>
            </div>
        </div>
        <% }%>

    </div>
</div>

<jsp:include page="footer.jsp" />
