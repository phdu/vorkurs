all:
	make -C Tag_1
	make -C Tag_2
	make -C Tag_3
	make -C Tag_4
	cp Tag_1/*.pdf ./
	cp Tag_2/*.pdf ./
	cp Tag_3/*.pdf ./
	cp Tag_4/*.pdf ./
	
clean:
	make clean -C Tag_1
	make clean -C Tag_2
	make clean -C Tag_3
	make clean -C Tag_4
	@-rm -rf *.pdf 2>/dev/null || true