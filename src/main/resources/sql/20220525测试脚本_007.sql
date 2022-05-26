 
DROP TABLE IF EXISTS #History10_77A;   -- select * from #History10_77A
create table #History10_77A([ID] [int] IDENTITY(1,1) NOT NULL primary key,n1 INT,n2 INT,n3 INT,n4 INT,n5 INT,n6 INT,n7 INT,n8 INT,n9 INT,n10 INT);  
insert into #History10_77A   
        SELECT ' 1','2','13','14','20','21','29','30','44','55'
UNION ALL SELECT ' 3','4','5','6','7','8','19','20','22','29'
UNION ALL SELECT ' 5','6','7','8','9','10','11','12','13','14'
UNION ALL SELECT ' 7','8','9','10','11','12','13','24','29','57'
UNION ALL SELECT ' 9','10','11','12','21','26','36','39','45','56';

DROP TABLE IF EXISTS #F27X9_133a;  
create table #F27X9_133a([ID] [int] IDENTITY(1,1) NOT NULL primary key,S1 INT,S2 INT,S3 INT,S4 INT,S5 INT,S6 INT,S7 INT,S8 INT,S9 INT,S10 INT);  
insert into #F27X9_133a 
        SELECT ' 1','12','13','14','20','21','29','30','44','55'
UNION ALL SELECT ' 3','4','5','6','17','18','19','20','22','29'
UNION ALL SELECT ' 5','6','7','8','9','10','11','22','23','24'
UNION ALL SELECT ' 7','8','9','10','11','12','13','24','39','57'
UNION ALL SELECT '10','11','12','21','26','36','39','45','56','77';

DROP TABLE IF  EXISTS #JCHtory10;
--create table JCResult_9([ID] [int] IDENTITY(1,1) NOT NULL primary key,n1 INT,n2 INT,n3 INT,n4 INT,n5 INT,n6 INT,n7 INT,n8 INT,n9 INT,n10 INT);
 
 ;with History10_77A as(
   select * ,concat_ws(' ',n1,n2,n3,n4,n5,n6,n7,n8,n9,n10)as notext from #History10_77A
 )
select ID,n1 as  gid into #JCHtory10 from History10_77A
union all select ID,n2 from History10_77A
union all select ID,n3 from History10_77A
union all select ID,n4 from History10_77A
union all select ID,n5 from History10_77A
union all select ID,n6 from History10_77A
union all select ID,n7 from History10_77A
union all select ID,n8 from History10_77A
union all select ID,n9 from History10_77A
union all select ID,n10 from History10_77A;

DROP TABLE IF  EXISTS #JCF27X9;

;with F27X9_133a as (
select * ,concat_ws(' ',S1,S2,S3,S4,S5,S6,S7,S8)as notext from #F27X9_133a
)
select ID,S1 as  cid into #JCF27X9 FROM #F27X9_133a 
union all select ID,S2 FROM #F27X9_133a 
union all select ID,S3 FROM #F27X9_133a 
union all select ID,S4 FROM #F27X9_133a 
union all select ID,S5 FROM #F27X9_133a 
union all select ID,S6 FROM #F27X9_133a
union all select ID,S7 FROM #F27X9_133a 
union all select ID,S8 FROM #F27X9_133a 
union all select ID,S9 FROM #F27X9_133a 
union all select ID,S10 FROM #F27X9_133a ;
 
 DROP TABLE IF  EXISTS #JCResult;

SELECT #JCHtory10.id into #JCResult FROM #JCHtory10 JOIN #JCF27X9 ON #JCHtory10.gid = #JCF27X9.cid 
            GROUP BY #JCHtory10.id, #JCF27X9.ID 
        HAVING COUNT( 1 ) = 9 ;-- 设定6,7,8,9就可以得到不同的查询结果
              
--INSERT INTO JCResult_9
  ;with History10_77A as(
   select * ,concat_ws(' ',n1,n2,n3,n4,n5,n6,n7,n8,n9,n10)as notext from #History10_77A
 )
SELECT * from History10_77A a 
        WHERE EXISTS( SELECT 1 FROM #JCResult b WHERE a.id = b.id );
 
 
 
 