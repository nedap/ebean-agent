package com.avaje.ebean;

import com.avaje.ebean.annotation.DocStoreMode;
import com.avaje.ebean.bean.PersistenceContext;
import com.avaje.ebean.config.PersistBatch;
import com.avaje.ebean.event.changelog.BeanChange;
import com.avaje.ebean.event.changelog.ChangeSet;
import com.avaje.ebeaninternal.api.DerivedRelationshipData;
import com.avaje.ebeaninternal.api.SpiTransaction;
import com.avaje.ebeaninternal.api.TransactionEvent;
import com.avaje.ebeaninternal.server.core.PersistRequest;
import com.avaje.ebeaninternal.server.core.PersistRequestBean;
import com.avaje.ebeaninternal.server.persist.BatchControl;

import javax.persistence.OptimisticLockException;
import javax.persistence.PersistenceException;
import javax.persistence.RollbackException;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;


public class TDTransaction implements SpiTransaction {

  Boolean getGeneratedKeys;

  @Override
  public Boolean isUpdateAllLoadedProperties() {
    return null;
  }

  @Override
  public DocStoreMode getDocStoreMode() {
    return null;
  }

  @Override
  public int getDocStoreBatchSize() {
    return 0;
  }

  @Override
  public Boolean getBatchGetGeneratedKeys() {
    return getGeneratedKeys;
  }

  @Override
  public void addBeanChange(BeanChange beanChange) {

  }

  @Override
  public void sendChangeLog(ChangeSet changeSet) {

  }

  @Override
  public void setDocStoreMode(DocStoreMode docStoreMode) {

  }

  @Override
  public void setDocStoreBatchSize(int i) {

  }

  @Override
  public void setUpdateAllLoadedProperties(boolean b) {

  }

  @Override
  public String getLogPrefix() {
    return null;
  }

  @Override
  public boolean isLogSql() {
    return false;
  }

  @Override
  public boolean isLogSummary() {
    return false;
  }

  @Override
  public void logSql(String msg) {

  }

  @Override
  public void logSummary(String msg) {

  }

  @Override
  public void registerDerivedRelationship(DerivedRelationshipData assocBean) {

  }

  @Override
  public List<DerivedRelationshipData> getDerivedRelationship(Object bean) {
    return null;
  }

  @Override
  public void registerDeleteBean(Integer hash) {

  }

  @Override
  public void unregisterDeleteBean(Integer hash) {

  }

  @Override
  public boolean isRegisteredDeleteBean(Integer hash) {
    return false;
  }

  @Override
  public void unregisterBean(Object bean) {

  }

  @Override
  public boolean isRegisteredBean(Object bean) {
    return false;
  }

  @Override
  public String getId() {
    return null;
  }

  @Override
  public void register(TransactionCallback callback) {

  }

  @Override
  public boolean isReadOnly() {
    return false;
  }

  @Override
  public void setReadOnly(boolean readOnly) {

  }

  @Override
  public void commit() throws RollbackException {

  }

  @Override
  public void rollback() throws PersistenceException {

  }

  @Override
  public void rollback(Throwable e) throws PersistenceException {

  }

  @Override
  public void end() throws PersistenceException {

  }

  @Override
  public boolean isActive() {
    return false;
  }

  @Override
  public void setPersistCascade(boolean persistCascade) {

  }

  @Override
  public void setBatchMode(boolean useBatch) {

  }

  @Override
  public void setBatch(PersistBatch persistBatchMode) {

  }

  @Override
  public PersistBatch getBatch() {
    return null;
  }

  @Override
  public void setBatchOnCascade(PersistBatch batchOnCascadeMode) {

  }

  @Override
  public PersistBatch getBatchOnCascade() {
    return null;
  }

  @Override
  public void setBatchSize(int batchSize) {

  }

  @Override
  public int getBatchSize() {
    return 0;
  }

  @Override
  public void setBatchGetGeneratedKeys(boolean getGeneratedKeys) {
    this.getGeneratedKeys = getGeneratedKeys;
  }

  @Override
  public void setBatchFlushOnMixed(boolean batchFlushOnMixed) {

  }

  @Override
  public void setBatchFlushOnQuery(boolean batchFlushOnQuery) {

  }

  @Override
  public boolean isBatchFlushOnQuery() {
    return false;
  }

  @Override
  public void flushBatch() throws PersistenceException, OptimisticLockException {

  }

  @Override
  public Connection getConnection() {
    return null;
  }

  @Override
  public void addModification(String tableName, boolean inserts, boolean updates, boolean deletes) {

  }

  @Override
  public void putUserObject(String name, Object value) {

  }

  @Override
  public Object getUserObject(String name) {
    return null;
  }

  @Override
  public void depth(int diff) {
  }

  @Override
  public int depth() {
    return 0;
  }

  @Override
  public boolean isExplicit() {
    return false;
  }

  @Override
  public TransactionEvent getEvent() {
    return null;
  }

  @Override
  public boolean isPersistCascade() {
    return false;
  }

  @Override
  public boolean isBatchThisRequest(PersistRequest.Type type) {
    return false;
  }

  @Override
  public BatchControl getBatchControl() {
    return null;
  }

  @Override
  public void setBatchControl(BatchControl control) {

  }

  @Override
  public PersistenceContext getPersistenceContext() {
    return null;
  }

  @Override
  public void setPersistenceContext(PersistenceContext context) {

  }

  @Override
  public Connection getInternalConnection() {
    return null;
  }

  @Override
  public boolean isSaveAssocManyIntersection(String intersectionTable, String beanName) {
    return false;
  }

  @Override
  public boolean checkBatchEscalationOnCascade(PersistRequestBean<?> request) {
    return false;
  }

  @Override
  public void flushBatchOnCascade() {

  }

  @Override
  public void markNotQueryOnly() {

  }

  @Override
  public void checkBatchEscalationOnCollection() {

  }

  @Override
  public void flushBatchOnCollection() {

  }

  @Override
  public void close() throws IOException {

  }
}
