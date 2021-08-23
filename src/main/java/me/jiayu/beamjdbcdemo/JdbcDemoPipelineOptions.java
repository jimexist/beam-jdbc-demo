package me.jiayu.beamjdbcdemo;

import org.apache.beam.sdk.options.Default;
import org.apache.beam.sdk.options.Description;
import org.apache.beam.sdk.options.PipelineOptions;

public interface JdbcDemoPipelineOptions extends PipelineOptions {

  @Description("Input sqlite file name for the pipeline")
  @Default.String("jdbc:sqlite:///Users/jiayu_liu/Desktop/beam-demo.sqlite")
  String getSqliteFileName();

  void setSqliteFileName(String sqliteFileName);

  @Description("Input source table for the pipeline")
  String getSourceTable();

  void setSourceTable(String sourceTable);
}
