/*
 * This file is generated by jOOQ.
 */
package com.machingclee.experiments.generated.tables;


import com.machingclee.experiments.generated.Keys;
import com.machingclee.experiments.generated.Public;
import com.machingclee.experiments.generated.tables.records._PrismaMigrationsRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class _PrismaMigrations extends TableImpl<_PrismaMigrationsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public._prisma_migrations</code>
     */
    public static final _PrismaMigrations _PRISMA_MIGRATIONS = new _PrismaMigrations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<_PrismaMigrationsRecord> getRecordType() {
        return _PrismaMigrationsRecord.class;
    }

    /**
     * The column <code>public._prisma_migrations.id</code>.
     */
    public final TableField<_PrismaMigrationsRecord, String> ID = createField(DSL.name("id"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public._prisma_migrations.checksum</code>.
     */
    public final TableField<_PrismaMigrationsRecord, String> CHECKSUM = createField(DSL.name("checksum"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>public._prisma_migrations.finished_at</code>.
     */
    public final TableField<_PrismaMigrationsRecord, OffsetDateTime> FINISHED_AT = createField(DSL.name("finished_at"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>public._prisma_migrations.migration_name</code>.
     */
    public final TableField<_PrismaMigrationsRecord, String> MIGRATION_NAME = createField(DSL.name("migration_name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public._prisma_migrations.logs</code>.
     */
    public final TableField<_PrismaMigrationsRecord, String> LOGS = createField(DSL.name("logs"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public._prisma_migrations.rolled_back_at</code>.
     */
    public final TableField<_PrismaMigrationsRecord, OffsetDateTime> ROLLED_BACK_AT = createField(DSL.name("rolled_back_at"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>public._prisma_migrations.started_at</code>.
     */
    public final TableField<_PrismaMigrationsRecord, OffsetDateTime> STARTED_AT = createField(DSL.name("started_at"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column <code>public._prisma_migrations.applied_steps_count</code>.
     */
    public final TableField<_PrismaMigrationsRecord, Integer> APPLIED_STEPS_COUNT = createField(DSL.name("applied_steps_count"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    private _PrismaMigrations(Name alias, Table<_PrismaMigrationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private _PrismaMigrations(Name alias, Table<_PrismaMigrationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public._prisma_migrations</code> table reference
     */
    public _PrismaMigrations(String alias) {
        this(DSL.name(alias), _PRISMA_MIGRATIONS);
    }

    /**
     * Create an aliased <code>public._prisma_migrations</code> table reference
     */
    public _PrismaMigrations(Name alias) {
        this(alias, _PRISMA_MIGRATIONS);
    }

    /**
     * Create a <code>public._prisma_migrations</code> table reference
     */
    public _PrismaMigrations() {
        this(DSL.name("_prisma_migrations"), null);
    }

    public <O extends Record> _PrismaMigrations(Table<O> child, ForeignKey<O, _PrismaMigrationsRecord> key) {
        super(child, key, _PRISMA_MIGRATIONS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<_PrismaMigrationsRecord> getPrimaryKey() {
        return Keys._PRISMA_MIGRATIONS_PKEY;
    }

    @Override
    public List<UniqueKey<_PrismaMigrationsRecord>> getKeys() {
        return Arrays.<UniqueKey<_PrismaMigrationsRecord>>asList(Keys._PRISMA_MIGRATIONS_PKEY);
    }

    @Override
    public _PrismaMigrations as(String alias) {
        return new _PrismaMigrations(DSL.name(alias), this);
    }

    @Override
    public _PrismaMigrations as(Name alias) {
        return new _PrismaMigrations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public _PrismaMigrations rename(String name) {
        return new _PrismaMigrations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public _PrismaMigrations rename(Name name) {
        return new _PrismaMigrations(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, OffsetDateTime, String, String, OffsetDateTime, OffsetDateTime, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
