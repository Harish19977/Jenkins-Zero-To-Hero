FROM nginx:alpine

# Remove default nginx config (cleaner, smaller runtime)
RUN rm -rf /usr/share/nginx/html/*

# Copy static frontend files
COPY index.html /usr/share/nginx/html/index.html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
