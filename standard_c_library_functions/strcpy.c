char *mycopy(char *dest, const char *src) {
	if(src == NULL) {
		return(NULL);
	}
	int i =0;
	while(src[i] != '\0'){
		dest[i] = src[i];
		i++;
	}
	dest[i] = '\0';

	return(dest);
}