;WITH t AS 
(
SELECT TOP 43 rn=ROW_NUMBER()OVER(ORDER BY @@spid)
FROM sysobjects 
)
SELECT [ID]=Identity(bigint,1,1),
a.rn as n1
								,b.rn as n2
							,c.rn as n3
						,d.rn as n4
					,e.rn as n5
				,f.rn as n6
			,g.rn as n7
		,h.rn as n8
	,i.rn as n9
,j.rn as n10
,concat_ws(' ',a.rn
				,b.rn
					,c.rn
						,d.rn
							,e.rn
								,f.rn
									,g.rn
										,h.rn 
											,i.rn
												,j.rn) as ntext 
INTO [History10_77A]  
FROM t a
JOIN t b ON a.rn<b.rn
	JOIN t c ON b.rn<c.rn
		JOIN t d ON c.rn<d.rn
			JOIN t e ON d.rn<e.rn
				JOIN t f ON e.rn<f.rn
			JOIN t g ON f.rn<g.rn
		JOIN t h ON g.rn<h.rn
	JOIN t i ON h.rn<i.rn
JOIN t j ON i.rn<j.rn