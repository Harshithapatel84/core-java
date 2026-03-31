class BridgeRunner {
    public static void main(String[] args) {

        SmartGlassBridge smart=new SmartGlassBridge();
        smart.clean();
        smart.transparentView();
        smart.cross();
        smart.safety();

        System.out.println("----------------");

        WoodenBridge wood=new WoodenBridge();
        wood.material();
        wood.cross();
        wood.safety();
    }
}