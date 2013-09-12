doc = Vorkurs_Tag1
#doc2 = Vorkurs_Tag1_Aufgaben
#doc3 = Vorkurs_Tag1_Loesungen

all : $(doc).pdf #$(doc2).pdf $(doc3).pdf

folien : $(doc).pdf

aufgaben : $(doc2).pdf

loesungen : $(doc3).pdf

$(doc).pdf : $(doc).tex
	@-rm $(doc).{aux,log,nav,out,pdf,snm,toc,vrb} 2>/dev/null || true
	pdflatex $(doc)
	pdflatex $(doc)

$(doc2).pdf : $(doc2).tex
	@-rm $(doc2).{aux,log} 2>/dev/null || true
	pdflatex $(doc2)

$(doc3).pdf : $(doc3).tex
	@-rm $(doc3).{aux,log} 2>/dev/null || true
	pdflatex $(doc3)

.PHONY : clean
clean :
	@-rm $(doc).{aux,log,nav,out,pdf,snm,toc,vrb} 2>/dev/null || true
	@-rm $(doc2).{aux,log,pdf,} 2>/dev/null || true
	@-rm $(doc3).{aux,log,pdf,} 2>/dev/null || true