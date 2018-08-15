package sk.mh.bigdatatest;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * Created by matus.hozza on 7/28/2018.
 */
public class ShoppingCartMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

    private static final String DELIMITER = ",";

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

        final String[] tokens = value.toString().split(DELIMITER);
        final ShoppingCartEvent shoppingCartEvent = ShoppingCartEvent.Builder.aShoppingCartEvent()
                .withId(tokens[0])
                .withCustomer_id(tokens[1])
                .withStore_id(tokens[2])
                .withSensor_id(tokens[3])
                .withSensor_metadata(tokens[4])
                .withTimestamp(Long.parseLong(tokens[5]))
                .build();
        context.write(new Text(shoppingCartEvent.getCustomer_id()), new IntWritable(1));

        super.map(key, value, context);
    }
}
