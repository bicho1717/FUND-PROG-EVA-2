<?xml version="1.0"?>
<flowgorithm fileversion="3.0">
    <attributes>
        <attribute name="name" value=""/>
        <attribute name="authors" value="invitado"/>
        <attribute name="about" value=""/>
        <attribute name="saved" value="2023-10-09 05:44:04 p. m."/>
        <attribute name="created" value="aW52aXRhZG87TEFCMDIwNDIzOzIwMjMtMTAtMDk7MDU6MDI6NDYgcC4gbS47MjgzNA=="/>
        <attribute name="edited" value="aW52aXRhZG87TEFCMDIwNDIzOzIwMjMtMTAtMDk7MDU6NDQ6MDQgcC4gbS47MjsyOTQz"/>
    </attributes>
    <function name="Main" type="None" variable="">
        <parameters/>
        <body>
            <declare name="califa" type="Integer" array="False" size=""/>
            <output expression="&quot;Introduce la calificacion:&quot;" newline="True"/>
            <input variable="califa"/>
            <if expression="califa&gt;=70">
                <then>
                    <output expression="&quot;Aprobado: Viaje a canc&#250;n&quot;" newline="True"/>
                </then>
                <else>
                    <output expression="&quot;N/A Acreditado: A repetir materia&quot;" newline="True"/>
                </else>
            </if>
            <output expression="&quot;Fin del programa&quot;" newline="True"/>
        </body>
    </function>
</flowgorithm>
