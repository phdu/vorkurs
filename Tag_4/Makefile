doc = Vorkurs_Tag4

all : $(doc).pdf

folien : $(doc).pdf

$(doc).pdf : $(doc).tex
	@-rm $(doc).{aux,log,nav,out,pdf,snm,toc,vrb} 2>/dev/null || true
	pdflatex $(doc)
	pdflatex $(doc)

.PHONY : clean
clean :
	@-rm $(doc).{aux,log,nav,out,pdf,snm,toc,vrb} 2>/dev/null || true

