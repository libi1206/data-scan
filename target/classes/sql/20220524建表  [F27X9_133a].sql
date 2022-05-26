if object_id('tempdb..#F27X9') is not null drop table #F27X9   
go
create table #F27X9([ID] [int] IDENTITY(1,1) NOT NULL primary key,n1 INT,n2 INT,n3 INT,n4 INT,n5 INT,n6 INT,n7 INT,n8 INT,n9 INT,n10 INT,n11 INT,n12 INT,n13 INT,n14 INT,n15 INT,n16 INT,n17 INT,n18 INT,n19 INT,n20 INT,n21 INT,n22 INT,n23 INT,n24 INT,n25 INT,n26 INT,n27 INT
)  
insert into #F27X9 

select '53','54','52','30','77','51','62','19','78','3','59','50','16','15','2','48','43','27','12','10','23','37','13','67','66','34','75'


;WITH t AS 
(
select rn from  #F27X9 unpivot(rn for TYPE in(n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16,n17,n18,n19,n20,n21,n22,n23,n24,n25,n26,n27
)) as p
 GROUP BY rn
) 
SELECT 
[ID]=Identity(INT,1,1),
a.rn as S1
								,b.rn as S2
							,c.rn as S3
						,d.rn as S4
					,e.rn as S5
				,f.rn as S6
			,g.rn as S7
		,h.rn as S8
	,i.rn as S9
,concat_ws(' ',a.rn
				,b.rn
					,c.rn
						,d.rn
							,e.rn
								,f.rn
									,g.rn
										,h.rn ) as notext 
INTO [F27X9_133a] 
FROM t a
JOIN t b ON a.rn<b.rn
	JOIN t c ON b.rn<c.rn
		JOIN t d ON c.rn<d.rn
			JOIN t e ON d.rn<e.rn
				JOIN t f ON e.rn<f.rn
			JOIN t g ON f.rn<g.rn
		JOIN t h ON g.rn<h.rn
	JOIN t i ON h.rn<i.rn
