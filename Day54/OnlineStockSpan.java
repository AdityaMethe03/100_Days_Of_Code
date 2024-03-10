class StockSpanner {

    private Stack<Integer> stocks;
    private Stack<Integer> spans;

    public StockSpanner() {
        stocks = new Stack<>();
        spans = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        while (!stocks.isEmpty() && price >= stocks.peek()) {
            span += spans.pop();
            stocks.pop();
        }
        stocks.push(price);
        spans.push(span);
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
