FROM node
WORKDIR /app
COPY package.json .
RUN npm install
# copy all files
COPY . .
ENTRYPOINT ["npm", "run", "dev"]
