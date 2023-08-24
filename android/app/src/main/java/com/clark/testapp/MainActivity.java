package com.clark.testapp;

import android.os.Bundle;

import com.clark.plugin.testplugin.TestPlugin;
import com.clark.plugin.testplugin.TestPluginPlugin;
import com.getcapacitor.BridgeActivity;
public class MainActivity extends BridgeActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        registerPlugin(TestPluginPlugin.class);
        super.onCreate(savedInstanceState);
        testPlugins();
    }
    void testPlugins(){
    }
}
