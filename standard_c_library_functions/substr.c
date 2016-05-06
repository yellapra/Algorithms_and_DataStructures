char *mySubstr(const char *src, char *dest, int position, int length) {
	if(src == NULL) {
		return NULL;
	}

	while(length > 0) {
		*dest = *(src+position);
		dest++;
		src++;
		length--;
	}
	return dest;
}