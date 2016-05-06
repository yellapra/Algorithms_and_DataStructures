char *myStrcat(char *src, const char *concat) {
	if(concat == NULL){
		return src;
	}

	if(src == NULL){
		return concat;
	}
	char *start = src;
	while(*src != '\0'){
		src++;
	}

	while(*src++ = *concat++);
	return start;

}