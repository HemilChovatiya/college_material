<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
<body>
<h1 align="center"> Details with Salaries of Player</h1>
<table border="3" align="center" >
<tr>
<th>Player</th>
<th>Sports</th>
<th>Bidding</th>
<th>Country</th>
<th>Team</th>
</tr>
<xsl:for-each select="catalog/cd">
<tr>
<td><xsl:value-of select="Player"/></td>
<td><xsl:value-of select="Sports"/></td>
<td><xsl:value-of select="Bidding"/></td>
<td><xsl:value-of select="Country"/></td>
<td><xsl:value-of select="Team"/></td>
</tr>
</xsl:for-each>
</table> </body>
</html>
</xsl:template>
</xsl:stylesheet>