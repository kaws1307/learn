<html>
<head>
</head>
<body>
    <table>
        <#list music as music1>
        <tr>
            <td> ${music1.author} </td>
            <td> ${music1.song} </td>
        </tr>
        </#list>
    </table>
</body>
</html>