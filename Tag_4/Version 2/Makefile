doc = Vorkurs_Tag4

all : $(doc).pdf cleanup
debug : $(doc).pdf

$(doc).pdf : $(doc).tex
	@-rm $(doc).{aux,log,nav,out,pdf,snm,toc} 2>/dev/null || true
	pdflatex $(doc)
	pdflatex $(doc)

cleanup : $(doc).pdf
	@-rm $(doc).{aux,log,nav,out,snm,toc} 2>/dev/null || true

.PHONY : clean
clean :
	@-rm $(doc).{aux,log,nav,out,pdf,snm,toc} 2>/dev/null || true

