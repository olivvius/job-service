// create database
db=db.getSiblingDB('job');

//create user
db.createUser({
    user: "job_user",
    pwd: "job_user",
    roles:[
        {
            role: "readWrite",
            db:"job"
        }
    ]
})


// create collection
db.createCollection('job');

//create documents
db.job.insertMany([
    {
        description: "senior java dev",
        company:"amazon",
        skills:["java","spring", "docker"],
        salary: 10000,
        isRemote: false

    },
    {
        description: "junior java dev",
        company:"amazon",
        skills:["java","spring", "docker"],
        salary: 5000,
        isRemote: false

    }
])