doc = Vorkurs_Tag2
doc2 = Vorkurs_Tag2_Aufgaben
doc3 = Vorkurs_Tag2_Loesungen

all :
	pdflatex $(doc); pdflatex $(doc); pdflatex $(doc2); pdflatex $(doc3)

.PHONY : clean
clean :
	@-rm $(doc).{aux,log,nav,out,pdf,snm,toc,vrb} 2>/dev/null || true
	@-rm $(doc2).{aux,log,pdf,} 2>/dev/null || true
	@-rm $(doc3).{aux,log,pdf,} 2>/dev/null || true
