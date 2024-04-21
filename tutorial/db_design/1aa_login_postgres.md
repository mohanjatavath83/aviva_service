1. psql postgres
2. CREATE USER postgres_mohan WITH PASSWORD 'postgres';
3. ALTER ROLE postgres WITH CREATEDB (give permission)
3. alter user postgres with encrypted password 'postgres'
3. psql -U postgres -d aviva
2. show tables \dt
3. \d table name show indexes
4. drop "table table_name"

CREATE USER postgres WITH PASSWORD 'postgres';

ARTICLES
-------------

1. https://vladmihalcea.com/database-table-relationships/ ()
2. https://vladmihalcea.com/default-database-key-indexing/ (COMPLETED)

If you’ve just upgraded Postgres with Homebrew, and Postgres won’t start, as long as you don’t care about any data
stored locally, remove all versions of Postgres:

brew remove --force postgresql
You might have to specify a version if you used one of the @ version numbers, such as Postgres 14:

brew remove --force postgresql@14
Delete the Postgres folders:

rm -rf /usr/local/var/postgres/
rm -rf /usr/local/var/postgresql@14/
If you’re on an Apple Silicon Mac, delete these folders:

rm -rf /opt/homebrew/var/postgres
rm -rf /opt/homebrew/var/postgresql@14
Reinstall Postgres:

brew install postgresql@14
Fire it up:

brew services start postgresql@14
Verify that it’s running:

brew services list